import { Pessoa } from "../Class/pessoa";
export interface IUsuario {

  id:number,
  person:Pessoa,
  password:string
  email:string;

}
