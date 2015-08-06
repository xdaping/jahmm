package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class CreateHMM {

	public static void main(String[] args) throws Exception {
		Cli.main("create -opdf integer -r 3 -n 3 -o datas/initial.hmm".split(" "));
		
		Cli.main("print -i datas/initial.hmm".split(" "));

	}

}
/*
����һ��
 
����״̬��N=3
 
�۲�״̬��M= 3
 
 
 
-opdf �������۲����е�����
 
                 -opdf integer -r 10 �۲�״̬����Ϊ0,1,2,...,9��ʾ
 
                 -opdf gaussian_mixture -ng 3 �۲�״̬���еķֲ�Ϊ3����˹�ֲ�
 
                 -opdf  multi_gaussian -d 3 �۲�״̬���е�Ԫ��Ϊ3*3����
*/