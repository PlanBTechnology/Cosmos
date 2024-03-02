import { IGender } from "../interfaces/igender";

export class Gender implements IGender{
  gender: string = '';
  id:number = 0;

  getGender(): string {    return this.gender;}
  getId(): number {    return this.id;}

  setId(id: number): void {    this.id = id;}
  setGender(gender: string): void {    this.gender = gender;}

  verificagenero():boolean{
    if(this.gender != "" && this.id != 0){
      return true;
    }
    return false
  }
}
