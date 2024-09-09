const express =require('express');
const mysql=require('mysql2');
const cors=require('cors');
const bodyparser=require('body-parser');

const app=express();
app.use(cors());
app.use(bodyparser.json());

const db=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'Satara@123',
    database:'satara'

});
db.connect(function(err){
    if(err) throw err;
    console.log("database connect ");
});

app.get('/login',function(req,res){
var sql='select * from login';
db.query(sql,function(err,result){
    res.send(result);
});
});

app.get('/course',function(req,res){
    var sql='select * from course';
    db.query(sql,function(err,result){
        res.send(result);
    });

});


// app.post('/course',function(req,res){
//     const{id,name,fee,duration}=req.body;
//     const sql='insert into course values(?,?,?,?)';
//     db.query(sql,[id   , name ,fee  , duration ],function(err,result){
//         res.send({message:'insert into databse'});
//     });
app.post('/course',function(req,res){
const{id,name,fee,duration}=req.body;
//id   | name | fee  | duration 
var sql='insert into course values(?,?,?,?)';
db.query(sql,[id,name,fee,duration],function(err,result){
    res.send({message:'course added'});
});
});

app.put('/course/:id',function(req,res){
    const{id}=req.params;
    const{name,fee,duration}=req.body;
    const sql='update course set name=?,fee=?,duration=? where id=?';
    db.query(sql,[name,fee,duration,id],function(err,result){
        res.send({message:'update the value'});
    });
});
// app.put('/course/:id',function(req,res){
//     const{id}=req.params;
//     const{name,fee,duration}=req.body;
//     const sql='update course set name=?,fee=?,duration=? where id=?';
//     db.query(sql,[name,fee,duration,id],function(err,result){
//         res.send({message:'updated values succesfullay'});
//     });
// });













app.listen(5000,function(){
console.log('server run on 5000')
});