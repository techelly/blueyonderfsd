var str ='Hello';
var str1 ="Hello World blue Yonder pvt Ltd";

console.log(str.length);
console.log(str1.length);
console.log(str[0]);

console.log(str1.toUpperCase());

var arrStr = ["Hello", "World", "blue", "Yonder", "pvt", "Ltd"];
//["HELLO","WORLD","BLUE","YONDER","PVT","LTD"]
//arrStr.forEach()
var newArrStr=[];
for(aS in arrStr){
    newArrStr.push(arrStr[aS].toUpperCase());
}
console.log(newArrStr);


var newArrS=[];
arrStr.forEach((a)=>{
    newArrS.push(a.toUpperCase());
});
console.log(newArrS);

//var nArrs=[];
var nArrs=arrStr.map((a)=>a.toUpperCase());
console.log(nArrs);