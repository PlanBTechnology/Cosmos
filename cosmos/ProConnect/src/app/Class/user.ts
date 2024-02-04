import { IUsuario } from "../interfaces/iusuario";
import { Pessoa } from "./pessoa";


export class User implements IUsuario{


  constructor(){
    this.id = 0;
    this.person = new Pessoa();
    this.password = "";
    this.email = "";
  }
  id: number;
  person: Pessoa;
  password: string;
  email: string;
}
