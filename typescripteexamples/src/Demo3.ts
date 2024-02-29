class Demo3
{
    constructor(id :any, name : string ,age:number , pan ?:string,desig="GET")
    {
        console.log("ID :"+id);
        console.log("Name :"+name);
        console.log("Age : "+age);
        console.log("PAN : "+pan)
        console.log("Desig :"+desig)
    }
}
let d4= new Demo3("TCS100","Prabhat",35,"ABCD1234");
let d5= new Demo3("TCS200","Reshma",25);
let d6=new Demo3("TCS201","aryan",200,"AKDEHDDD","CTO");
