import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LocalStorageService {


  private storage: Storage;

  constructor() {
    this.storage = localStorage;
  }

  setData(key: string, value: any) {
    if (this.storage){
    this.storage.setItem(key, JSON.stringify(value));
    return true;
    }
    return false;
  }

  getData(key: string): any {
    if (this.storage) {
      const teste = this.storage.getItem(key);
      return teste ?JSON.parse(teste) : null;
    }
    return null;
  }

  removeData(key: string) :boolean{
    if (this.storage){
      this.storage.removeItem(key);
      return true;
    }
    return false;
  }

  clearData() :boolean{
    if (this.storage){
      this.storage.clear();
      return true;
    }
    return false;
  }
}
