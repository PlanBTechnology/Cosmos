import { Iprofilejobs, PkProfilejobs } from "../interfaces/iprofilejobs";
import { Job } from "./job";
import { Profile } from "./profile";

export class Profilejobs implements Iprofilejobs{
  PkProfileJobs: PkProfilejobs;
  experience: number;

  constructor(){
    this.PkProfileJobs = {profileId: new Profile, jobId: new Job};
    this.experience = 0;
  }
}
