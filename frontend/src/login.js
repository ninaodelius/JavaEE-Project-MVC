import React from "react";
import {Component} from "react";
import {useState} from "react";

export class Login extends React.Component {
constructor(props){
super(props);
this.state = {
    email: "",
    password: ""
};
    this.handleSignInInputChange = this.handleSignInInputChange.bind(this);
}
    handleSignInInputChange(event){
        const target = event.target;
        const value = target.input;
        const name = target.name;
        this.setState({
            [name]: value
        });
    }


render(){
        return(
        <div>
    <form>
        <label>
            email:
            <br/>
            <input
                type="email"
                name="email"
                value={this.state.email}
                onChange={this.handleSignInInputChange}
                placeholder={"enter email"}
            />
        </label>
        <br/>
        <label>
            password:
            <br/>
            <input
                type="password"
                name="password"
                value={this.state.password}
                onChange={this.handleSignInInputChange}
                placeholder={"enter password"}
            />
        </label>
        <br/>
        <input type="submit" value="sign in" />
    </form>
    <button

        ref='/feed'
    >
        join us
    </button>
        </div>
    );
}
}
