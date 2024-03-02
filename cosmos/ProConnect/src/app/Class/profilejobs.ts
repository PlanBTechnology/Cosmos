import { IJob } from "../interfaces/ijob";
import { Iprofile } from "../interfaces/iprofile";
import { Iprofilejobs, PkProfilejobs } from "../interfaces/iprofilejobs";
import { Job } from "./job";
import { Profile } from "./profile";

export class Profilejobs implements Iprofilejobs{

  constructor(job:IJob, profile:Profile, experience:number){
    this.PKProfileJobs.jobId = job;
    this.PKProfileJobs.profileId = profile;
    this.experience = experience;
  }
  PKProfileJobs: PkProfilejobs = {jobId: new Job(), profileId:new Profile()};
  experience: number = 0;

  getProfile(): Iprofile{return this.PKProfileJobs.profileId}
  setProfile(profile: Iprofile){this.PKProfileJobs.profileId = profile}

  getJob(): IJob{return this.PKProfileJobs.jobId}
  setJob(job: IJob){this.PKProfileJobs.jobId = job}

  getExperience(): number {return this.experience}
  setExperience(experience: number){this.experience = experience}

  getPKProfileJobs(): PkProfilejobs { return this.PKProfileJobs }
  setPKProfileJobs(pkProfileJobs: PkProfilejobs): void {}

}
