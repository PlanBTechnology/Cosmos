import { Imaritalstatus } from "../interfaces/imaritalstatus";

export class Maritalstatus implements Imaritalstatus{
  maritalStatus: string;
  id: number;
  constructor(){
    this.id = 0;
    this.maritalStatus = "";
  }
}
