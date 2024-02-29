/**let a ="Karthik";// Global Scope
function greet(){
    //variable a can be used here inside the function
    //var a = "hello1"; // Local Scope
   // let a;
    a = "hello"; // within function scope we are changing the value of varibale a 
    let x="Hi";
    console.log("-----"+a +"---"+x);
}
greet();
console.log(a);
//console.log(x);
*/
var msg = "Good Afternoon";
let impMsg ="You are not in College";
function importantMsg(){
        if(true){
           var msg2 = "Please don't sleep";  
        //}else{
           let impMsg2 = "Don't behave like a Kindergarten pupil"; 
        }   
        console.log("Do minute chup nahi baith sakta me ");
        console.log(msg2);
        console.log(impMsg2);
}

importantMsg();
console.log("*************************************");
console.log(msg);
console.log(impMsg);
console.log(msg2);
console.log(impMsg2);
