import { IAbilities } from "../interfaces/iabilities";
import { IJob } from "../interfaces/ijob";
import { Iprofile } from "../interfaces/iprofile";import { IProfileconf } from "../interfaces/iprofileconf";
import { Iprofilejobs } from "../interfaces/iprofilejobs";
import { Profileconf } from "./profileconf";
import { Profilejobs } from "./profilejobs";
;

export class Profile implements Iprofile{
  id: number = 0;
  profileconf: IProfileconf = new Profileconf();
  abilities: IAbilities[] = [];
  profilejobs: Iprofilejobs[] = [];

  public getAbilities(): IAbilities[] {return this.abilities}
  public setAbilities(abilities: IAbilities[]): void {this.abilities = abilities}

  public getProfilejobs(): Iprofilejobs[] {return this.profilejobs}
  public setProfilejobs(profilejobs: Iprofilejobs[]): void {this.profilejobs = profilejobs}

  public getId(): number {return this.id}
  public setId(id: number): void {this.id = id}

  public getProfileconf(): IProfileconf {return this.profileconf}
  public setProfileconf(profileconf: IProfileconf): void {this.profileconf = profileconf}

  public addJob(job:IJob, experience:number){
    this.profilejobs.push(new Profilejobs(job, this, experience));
  }
}
