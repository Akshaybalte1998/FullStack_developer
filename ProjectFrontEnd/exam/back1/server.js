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
    password:'',
    database:''

});
db.connect(function(err){
    if(err)throw err;
    console.log('database connected');
});




    
app.get('/vegetables',function(req,res){
    const sql='select * from vegetables';
    db.query(sql,function(err,result){
        res.send(result);
    });
        
    });
//id,name,type,quantity,
    app.post('/vegetables',function(req,res){
        const{id,name,fee,duration}=req.body;
        const sql='insert into vegetables values(?,?,?,?)';
        db.query(sql,[id   , name ,fee  , duration ],function(err,result){
            res.send({message:'insert into databse'});
        });
            
        });
    app.put('/vegetables/:id',function(req,res){
        const{id}=req.params;
        const{name,fee,duration}=req.body;
        const sql='update vegetables set name=?,fee=?,duration=? where id=?';
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