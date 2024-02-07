import { IAddress } from "../interfaces/iaddress";
import { State } from "./state";

export class Address implements IAddress{
  state: State;
  city: string;
  street: string;
  CEP: string;
  number: number;

  constructor(){
    this.state = new State();
    this.city = "";
    this.street = "";
    this.CEP = "";
    this.number = 0;
  }

}
