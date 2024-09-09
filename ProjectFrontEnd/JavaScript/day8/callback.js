arr=[{name:"blog1" ,content:"akshay"},{name:"bog1" ,content:"akhay"},{name:"blo1" ,content:"kshay"},{name:"blog1" ,content:"akshay"}]

function getblog(){
    setTimeout(()=>{
        console.log("in get functuon");
        var str="<ul>"
        for(var p of arr){
            str+=`<li> ${p.name}-------${p.content}</li>`
        }
        
        document.getElementById("mydiv").innerHTML=str
        str+="</ul>";

    },1000)
    return arr;
}

getblog();


















