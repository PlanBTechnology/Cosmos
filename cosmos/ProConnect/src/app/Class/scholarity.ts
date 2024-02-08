import { Ischolarity } from "../interfaces/ischolarity";

export class Scholarity implements Ischolarity{
  scholarity: string;
  id: number;
  constructor(){
    this.scholarity = "";
    this.id = 0;
  }
}
