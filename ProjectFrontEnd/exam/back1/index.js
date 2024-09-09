/*
1. first step
     in mysql command line 
    create databse databse_name
    use databse
    create table course(id int, name varchar(30), fee int,  duration int );
    insert into course values(1,"java",1000,6);

*/
/*
2 second step 
    open terminal in vs code
    mkdir backend
    cd backend
     npm init -y
     npm install express mysql2 cors body-Parser
*/
/*
3 third step create server.js file
wirte below code in it
*/

const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const bodyparser = require('body-parser');


const app=express();
app.use(cors());
app.use(bodyparser.json());



const db=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'Satara@123', //mysql passowrd
    database:'databse_name'//give databse name

});

db.connect(function(err){
    if(err)throw err;
    console.log('database connected');
});




    

app.get('/course',function(req,res){
    const sql='select * from course';
    db.query(sql,function(err,result){
        res.send(result);
    });
        
    });
//id   | name | fee  | duration 
    app.post('/course',function(req,res){
        const{id,name,fee,duration}=req.body;
        const sql='insert into course values(?,?,?,?)';
        db.query(sql,[id   , name ,fee  , duration ],function(err,result){
            res.send({message:'insert into databse'});
        });
            
        });
    app.put('/course/:id',function(req,res){
        const{id}=req.params;
        const{name,fee,duration}=req.body;
        const sql='update course set name=?,fee=?,duration=? where id=?';
        db.query(sql,[name,fee,duration,id],function(err,result){
            res.send({message:'updated values succesfullay'});
        });
    });

    app.delete('/course/:id',function(req,res){
        const{id}=req.params;
        const sql='delete from course where id=?';
        db.query(sql,[id],function(err,result){
            res.send({message: 'delete succesfully'});
        });
    });




const port=5000;
app.listen(port,function(){
    console.log(`port is running on ${port}`);
});

/*
 last step  for running
 node server.js
*/
