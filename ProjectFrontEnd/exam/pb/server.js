const express = require('express');

const mysql = require('mysql2');

const cors = require('cors');
const bodyparser = require('body-parser');
const app =express();
app.use(cors());
app.use(bodyparser.json());

const db=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'Satara@123',
    database:'p'


});
db.connect(err=> {
    
    
        console.log("connect databse");
    
    
});




app.get('/courses', (req, res) => {
    db.query('SELECT * FROM course ', (err, results) => {
       
        res.send(results);
    });
});

app.get('/login', (req, res) => {
    db.query('SELECT * FROM login ', (err, results) => {
       
        res.send(results);
    });
});





//| id   | name | fee  | duration
// app.post('/coursesADD', (req, res) => {
//     const { id,name, fee, duration } = req.body;
//     db.query('INSERT INTO course (id,name, fee, duration) VALUES (?,?, ?, ?)', [id,name, fee, duration], (err, results) => {
      
//         res.send({ success: true, message: 'Course added' });
//     });
// });
app.post('/courses', (req, res) => {
    const { id, name, fee, duration } = req.body;

    // Basic input validation
    if (!id || !name || fee === undefined || duration === undefined) {
        console.error('Invalid input:', req.body);
        return res.status(400).send({ success: false, message: 'Invalid input' });
    }

    db.query('INSERT INTO course (id, name, fee, duration) VALUES (?, ?, ?, ?)', [id, name, fee, duration], (err, results) => {
        if (err) {
            console.error('Error inserting course:', err);
            return res.status(500).send({ success: false, message: 'Database query failed', error: err });
        }

        res.send({ success: true, message: 'Course added successfully' });
    });
});

app.put('/courses/:id', (req, res) => {
    const { id } = req.params;
    const { name, fee, duration } = req.body;
    db.query('UPDATE course SET name = ?, fee = ?, duration = ? WHERE id = ?', [name, fee, duration, id], (err, results) => {
    
        res.send({ success: true, message: 'Course updated' });
    });
});

app.delete('/courses/:id', (req, res) => {
    const { id } = req.params;
    db.query('DELETE FROM course WHERE id = ?', [id], (err, results) => {
       
        res.send({ success: true, message: 'Course deleted' });
    });
});




const port=5000;
app.listen(port, () => {
   console.log('server running on port ');
  });