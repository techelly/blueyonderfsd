class User{
    id: number;
    firstName: string;
    lastName: string;

    constructor(id:number,firstName:string,lastName:string){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
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

export default User;