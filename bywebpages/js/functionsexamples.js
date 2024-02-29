//classic fuction
function displayMsg(){
    console.log("Good Afternoon");
}

displayMsg();//call to a function
//function defined and assigned to a variable
var msg = function printMsg(){
    console.log("Please wake up I know its boring as you have already done so many things in your life");
}
msg();//call to a function
console.log(typeof msg);
//function without a name 
var message = function (msg1,msg2){
    console.log(msg1+"  "+msg2);

}
message("Hello ", "Prajwal");//call to a function

var  calc =(a,b)=>a+b;
var result = calc(5,10);
console.log(calc);
console.log(result);