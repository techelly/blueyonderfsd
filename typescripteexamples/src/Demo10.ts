interface Customer{
     customerName: string
     setCustomerName(cname:string):void;
}

class User implements Customer{
    id: number;
    firstName: string;
    lastName: string;
    customerName:string

    constructor(id:number,firstName:string,lastName:string,customerName:string){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.customerName=customerName;
    }

    setCustomerName(cName:string):void{
        this.customerName=cName;
    }
    addCustomerName(cName :string){
        this.customerName=cName;
    }
    getId(){
        return this.id;
    }
    getFirstName(): string{
        return this.firstName;
    }

    getLastName(): string{
        return this.lastName;
    }

    setFirstName(firstName: string){
        this.firstName=firstName;
    }

    setLastName(lastName: string) :void {
        this.lastName=lastName;
    }
}

