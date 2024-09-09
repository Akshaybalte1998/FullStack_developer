const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const mysql = require('mysql2');

const app = express();
app.use(cors());
app.use(bodyParser.json());

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'Satara@123',
  database: 'course_management'
});

db.connect(err => {
  if (err) throw err;
  console.log('MySQL connected...');
});

app.post('/api/login', (req, res) => {
  const { email, password } = req.body;
  const query = 'SELECT * FROM user WHERE email = ? AND password = ?';
  db.query(query, [email, password], (err, results) => {
    if (err) throw err;
    if (results.length > 0) {
      res.json({ success: true });
    } else {
      res.json({ success: false });
    }
  });
});

app.get('/api/courses', (req, res) => {
  const query = 'SELECT * FROM course';
  db.query(query, (err, results) => {
    if (err) throw err;
    res.json(results);
  });
});

app.post('/api/courses', (req, res) => {
  const { cid, cname, fees, duration } = req.body;
  const query = 'INSERT INTO course (cid, cname, fees, duration) VALUES (?, ?, ?, ?)';
  db.query(query, [cid, cname, fees, duration], (err, result) => {
    if (err) throw err;
    res.json({ success: true, message: 'New course added successfully' });
  });
});

app.put('/api/courses/:cid', (req, res) => {
  const { cname, fees, duration } = req.body;
  const query = 'UPDATE course SET cname = ?, fees = ?, duration = ? WHERE cid = ?';
  db.query(query, [cname, fees, duration, req.params.cid], (err, result) => {
    if (err) throw err;
    res.json({ success: true, message: 'Course updated successfully' });
  });
});

app.delete('/api/courses/:cid', (req, res) => {
  const query = 'DELETE FROM course WHERE cid = ?';
  db.query(query, [req.params.cid], (err, result) => {
    if (err) throw err;
    res.json({ success: true, message: 'Course deleted successfully' });
  });
});

app.listen(5000, () => {
  console.log('Server running on port 5000');
});
