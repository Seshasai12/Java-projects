package p1;

public class pincheck {
public boolean k;
public boolean Verify(int Pinno) {
	switch(Pinno) {
	case 1111:k=true;
	break;
	case 2222:k=true;
	break;
	case 9999:k=true;
	break;
	case 1011:k=true;
	break;
	case 2000:k=true;
	break;
	case 1605:k=true;
	break;
	case 1995:k=true;
	break;
	case 0000:k=true;
	break;
	default:k=false;
	
	
	}
	return k;
	
}
	

}
