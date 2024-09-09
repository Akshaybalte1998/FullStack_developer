const express = require('express');
const mysql = require('mysql');
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.json());

// MySQL database connection
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'Satara@123',
  database: 'course_management', // replace with your database name
  authPlugins: {
    mysql_native_password: require('mysql/lib/protocol/auth_41')
  }
});

db.connect((err) => {
  if (err) {
    console.error('Error connecting to the database:', err);
    return;
  }
  console.log('Connected to the database');
});

// User login endpoint
app.post('/login', (req, res) => {
  const { email, password } = req.body;
  const query = 'SELECT * FROM user WHERE email = ? AND password = ?';
  db.query(query, [email, password], (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    if (results.length > 0) {
      res.status(200).json({ message: 'Login successful' });
    } else {
      res.status(401).json({ message: 'Invalid email or password' });
    }
  });
});

// Fetch all courses endpoint
app.get('/courses', (req, res) => {
  const query = 'SELECT * FROM course';
  db.query(query, (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    res.status(200).json(results);
  });
});

// Add a new course endpoint
app.post('/courses', (req, res) => {
  const { cid, cname, fees, duration } = req.body;

  // Validate fields
  if (!cid || !cname || !fees || !duration) {
    return res.status(400).json({ message: 'All fields are mandatory' });
  }
  if (/\d/.test(cname)) {
    return res.status(400).json({ message: 'Course name should not contain numbers' });
  }
  if (fees <= 0) {
    return res.status(400).json({ message: 'Fees should not be zero or negative' });
  }
  if (duration <= 0) {
    return res.status(400).json({ message: 'Duration should not be zero or negative' });
  }

  const query = 'INSERT INTO course (cid, cname, fees, duration) VALUES (?, ?, ?, ?)';
  db.query(query, [cid, cname, fees, duration], (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    res.status(201).json({ message: 'New course added successfully' });
  });
});

// Update a course endpoint
app.put('/courses/:cid', (req, res) => {
  const { cid } = req.params;
  const { cname, fees, duration } = req.body;

  // Validate fields
  if (!cname || !fees || !duration) {
    return res.status(400).json({ message: 'All fields are mandatory' });
  }
  if (/\d/.test(cname)) {
    return res.status(400).json({ message: 'Course name should not contain numbers' });
  }
  if (fees <= 0) {
    return res.status(400).json({ message: 'Fees should not be zero or negative' });
  }
  if (duration <= 0) {
    return res.status(400).json({ message: 'Duration should not be zero or negative' });
  }

  const query = 'UPDATE course SET cname = ?, fees = ?, duration = ? WHERE cid = ?';
  db.query(query, [cname, fees, duration, cid], (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    if (results.affectedRows > 0) {
      res.status(200).json({ message: 'Course updated successfully' });
    } else {
      res.status(404).json({ message: 'Course not found' });
    }
  });
});

// Delete a course endpoint
app.delete('/courses/:cid', (req, res) => {
  const { cid } = req.params;
  const query = 'DELETE FROM course WHERE cid = ?';
  db.query(query, [cid], (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    if (results.affectedRows > 0) {
      res.status(200).json({ message: 'Course deleted successfully' });
    } else {
      res.status(404).json({ message: 'Course not found' });
    }
  });
});

const PORT = process.env.PORT || 5000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
