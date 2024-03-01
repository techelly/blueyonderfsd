import {Component} from 'react';
class HelloMsg extends Component{
    /**constructor(props){
        super(props);
        //props.msg="Kya confusion hai ";//We can not reassign the read only 
    }*/
    render(){
        const msg = this.props.msg?this.props.msg:"Hi";
        return <div>Message from {this.props.name} : {msg}</div>;
    }
}


export default HelloMsg;