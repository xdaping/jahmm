package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class BaumWelchHMM {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Cli.main("learn-bw -opdf integer -r 3 -is datas/testInteger.seq -ni 10 -i datas/initial.hmm -o datas/test_bw.hmm".split(" "));
		
		Cli.main("print -i datas/test_bw.hmm".split(" "));
	}

}
