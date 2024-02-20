import { IUsuario } from "../interfaces/iusuario";
import { Pessoa } from "./pessoa";
import { Profile } from "./profile";


export class User implements IUsuario{


  constructor(){
    this.id =  0;
    this.person = null ||new Pessoa();
    this.password = "";
    this.email = "";
    this.profile = null || new Profile();
  }
  profile: Profile;
  id: number;
  person: Pessoa;
  password: string;
  email: string;
}
