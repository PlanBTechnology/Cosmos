import { Pessoa } from "../Class/pessoa";
import { Profile } from "../Class/profile";
export interface IUsuario {

  id:number,
  person:Pessoa,
  password:string
  email:string;
  profile:Profile;

}
