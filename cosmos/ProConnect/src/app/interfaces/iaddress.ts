import { IState } from "./istate";

export interface IAddress {
  state:IState;
  city:string;
  street:string;
  CEP:string;
  number:number;

  getState():IState;
  getCity():string;
  getStreet():string;
  getCEP():string;
  getNumber():number;

  setState(state:IState):void;
  setCity(city:string):void;
  setStreet(street:string):void;
  setCEP(CEP:string):void;
  setNumber(number:number):void;

  verificaEndereco():boolean;
}
