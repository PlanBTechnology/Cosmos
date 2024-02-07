import { Imaritalstatus } from "../interfaces/imaritalstatus";

export class Maritalstatus implements Imaritalstatus{
  maritalstatus: string;
  constructor(){
    this.maritalstatus = "";
  }
}
