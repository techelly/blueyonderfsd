import User from './user';
import {A,B} from './Demo6';

let hello='Hello World';
console.log(hello);
let userObj= new User(1,"Krishna","Kumar");
console.log(userObj.getId());
userObj=new User(2,"Nihal","C");
console.log(userObj.getId());
//userObj.setFirstName(141343);
let objA = new A();
//let objB = new B();