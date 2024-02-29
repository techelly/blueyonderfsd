/**
 * An array is a special variable, which can hold more than one value
 */


var person=["John","Doe",46];
console.log("Element at index position 0"+person[0]);
for(var i=0 ;i<person.length;i++){
    console.log(person[i]);
}
console.log(typeof person);
console.log(person.push("john@gmail.com"));
console.log(person);

console.log(person.pop());
console.log(person);


var numArray=[24,27,20,12,28];
console.log(numArray.reverse());
console.log(numArray.sort());
console.log(numArray.reverse());
console.log(numArray.toString());
console.log(numArray);