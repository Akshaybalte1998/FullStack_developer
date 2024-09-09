const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const bodyParser = require('body-parser');

const app = express();
app.use(cors());
app.use(bodyParser.json());

// MySQL connection
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root', // Your MySQL username
    password: 'Satara@123', // Your MySQL password
    database: 'course_management'
});

db.connect(err => {
    
    console.log('Connected to the database.');
});



// Login endpoint
app.post('/login', (req, res) => {
    const { email, password } = req.body;
    db.query('SELECT * FROM users WHERE email = ? AND password = ?', [email, password], (err, results) => {
       
            res.send({ success: true, message: 'Login successful' });
        
    });
});
app.get('/logind', (req, res) => {
    db.query('SELECT * FROM users ', (err, results) => {
       
            res.send({results });
        
    });
});

// CRUD endpoints for courses
app.get('/courses', (req, res) => {
    db.query('SELECT * FROM courses', (err, results) => {
       
        res.send(results);
    });
});

app.post('/courses', (req, res) => {
    const { cname, fees, duration } = req.body;
    db.query('INSERT INTO courses (cname, fees, duration) VALUES (?, ?, ?)', [cname, fees, duration], (err, results) => {
      
        res.send({ success: true, message: 'Course added' });
    });
});

app.put('/courses/:id', (req, res) => {
    const { id } = req.params;
    const { cname, fees, duration } = req.body;
    db.query('UPDATE courses SET cname = ?, fees = ?, duration = ? WHERE id = ?', [cname, fees, duration, id], (err, results) => {
    
        res.send({ success: true, message: 'Course updated' });
    });
});

app.delete('/courses/:id', (req, res) => {
    const { id } = req.params;
    db.query('DELETE FROM courses WHERE id = ?', [id], (err, results) => {
       
        res.send({ success: true, message: 'Course deleted' });
    });
});

const port = 5000;
app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});
