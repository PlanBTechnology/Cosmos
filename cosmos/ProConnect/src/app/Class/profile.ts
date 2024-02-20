import { Iprofile } from "../interfaces/iprofile";;
import { Abilities } from "./abilities";
import { Profileconf } from "./profileconf";
import { Profilejobs } from "./profilejobs";

export class Profile implements Iprofile{
  id: number;
  profileconf: Profileconf;
  abilities: Abilities[];
  profilejobs: Profilejobs[];

  constructor() {
    this.id = 0;
    this.profileconf = new Profileconf;
    this.abilities = [];
    this.profilejobs = [];
  }
}
