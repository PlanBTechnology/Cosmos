import { Imaritalstatus } from "../interfaces/imaritalstatus";

export class Maritalstatus implements Imaritalstatus{
  maritalStatus: string = '';
  id: number = 0;


  getMaritalStatus():string{return this.maritalStatus}
  getId():number{return this.id}

  setMaritalStatus(maritalStatus: string): void {this.maritalStatus = maritalStatus  }
  setId(id: number): void {this.id = id  }
}
