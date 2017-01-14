void func(){
	f1();
	if(condition){
		f2();
		return;
	} else {
		while(condition){
			f3();
			f4();
		}
		f5();
	}
	f6();
}