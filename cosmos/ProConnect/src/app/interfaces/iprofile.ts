import { IAbilities } from "./iabilities"
import { IJob } from "./ijob"
import { IProfileconf } from "./iprofileconf"
import { Iprofilejobs } from "./iprofilejobs"


export interface Iprofile {

  id:number;
  profileconf:IProfileconf;
  abilities:IAbilities[];
  profilejobs:Iprofilejobs[];

  getId():number
  getProfileconf():IProfileconf
  getAbilities():IAbilities[]
  getProfilejobs():Iprofilejobs[]

  setId(id:number):void
  setProfileconf(profileconf:IProfileconf):void
  setAbilities(abilities:IAbilities[]):void
  setProfilejobs(profilejobs:Iprofilejobs[]):void

  addJob(job:IJob, experience:number):void
}
