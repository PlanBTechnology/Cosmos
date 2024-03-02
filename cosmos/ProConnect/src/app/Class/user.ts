import { IPerson } from "../interfaces/iperson";
import { IUsuario } from "../interfaces/iusuario";
import { Iprofile } from "../interfaces/iprofile";
import { Profile } from "./profile";
import { Person } from "./person";


export class User implements IUsuario{

  id:number = 0;
  profile: Iprofile = new Profile();
  person: IPerson = new Person;
  password: string = '';
  email: string = '';

  public getProfile(): Iprofile { return this.profile}
  public setProfile(profile: Iprofile): void {this.profile = profile}

  public getId(): number {return this.id}
  public setId(id: number): void {this.id = id}

  public getPerson(): IPerson {return this.person}
  public setPerson(person: IPerson): void {}

  public getPassword(): string {return this.password}
  public setPassword(password: string): void {this.password = password}

  public getEmail(): string {return this.email}
  public setEmail(email: string): void {this.email = email}

  public verificaCampos():boolean{
    if(this.email == '' || this.password == ''){
      return false;
    }
    if(this.person.verficaPessoa() == false){
      return false;
    }
    return true
  }
}
