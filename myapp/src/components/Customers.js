import customers from '../customers.json';
function CustomerComponent(){
  //const customers1 = JSON.stringify(customers);
  //console.log(customers1);
  const listOfCustomers = customers.map(
      (cust)=> <p key={cust.id}>{cust.id}+{cust.fname}</p>  
    );
    console.log(listOfCustomers);

    //Employee object
    const emp = {id:11,name:"Abhilash"};//JS object

    console.log(JSON.stringify(emp));
  return (
    <div>
    {listOfCustomers}
    </div>
    );
}

export default CustomerComponent;