class Demo9
{
    protected dateOfBirth="15-10-2005"
    name="Krishna"
    //public name = "Thanesh"
    //Property 'salary' is private and only accessible within class 'Demo9'.
    private salary= 50000; //it will be only for sinlge class 
    getSalary(){
        return this.salary;
    }

}
class Demo10 extends Demo9
{

    constructor()
    {
        super();
        console.log("Name is : "+this.name)
        console.log("Salary : "+ this.getSalary())
        console.log("Name is : "+this.dateOfBirth)
    }

}
let d1= new Demo10();
