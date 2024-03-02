import { IPerson } from "./iperson";
import { Iprofile } from "./iprofile";
export interface IUsuario {


  person:IPerson;
  password:string;
  email:string;
  profile:Iprofile;
  id:number;

  getPerson():IPerson;
  setPerson(person:IPerson):void;

  getPassword():string;
  setPassword(password:string):void;

  getEmail():string;
  setEmail(email:string):void;

  getProfile():Iprofile;
  setProfile(profile:Iprofile):void;

  getId():number;
  setId(id:number):void;
}
