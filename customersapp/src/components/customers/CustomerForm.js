import {useState} from 'react';
function CustomerForm({cust,addCustomer}){
    const [firstName,setFirstName] = useState("");
    const [lastName,setLastName] = useState("");
    const [email,setEmail] = useState("");
    const [customer,setCustomer]=useState(
            {
            firstName:"", 
            lastName:"",
            email:""}
        );
         
    const handleSubmit =(e)=> {
        e.preventDefault();
            
        customer.firstName=firstName;
        customer.lastName=lastName;
        customer.email=email;
        setCustomer(customer);
        //addCustomer(customer);
        console.log(customer);
      };
      

     const handleFirstNameChange=(e)=>{
        console.log("hii");
        setFirstName(e.target.value);
    }
    const handleLastNameChange=(e)=>{
        console.log("last name");
        setLastName(e.target.value);
    }
    const handleEmailChange=(e)=>{
        console.log("email change");
        setEmail(e.target.value);
    }
    return (
       <div>
       <form onSubmit={handleSubmit} className="form">
            <div className="form-group">
                <label> First Name</label>
                <input 
                       type="text" 
                       name="firstName" 
                       className="form-control" 
                       value={firstName} 
                       onChange={handleFirstNameChange}/>
                <label> Last Name</label>
                <input 
                       type="text" 
                       name="lastName" 
                       className="form-control" 
                       value={lastName} 
                       onChange={handleLastNameChange}/>
                <label> Email</label>
                <input 
                       type="text" 
                       name="email" 
                       className="form-control" 
                       value={email} 
                       onChange={handleEmailChange}/>
                <input 
                       type="submit" 
                       name="submit" 
                       className="form-control" 
                       value="Submit" 
                       onClick={addCustomer}/>
            </div>    
        </form>
       </div>
    );
}

export default CustomerForm;