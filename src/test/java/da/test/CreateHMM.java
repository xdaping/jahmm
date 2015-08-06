package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class CreateHMM {

	public static void main(String[] args) throws Exception {
		Cli.main("create -opdf integer -r 3 -n 3 -o datas/initial.hmm".split(" "));
		
		Cli.main("print -i datas/initial.hmm".split(" "));

	}

}
/*
生成一个
 
隐藏状态数N=3
 
观测状态数M= 3
 
 
 
-opdf 参数：观测序列的类型
 
                 -opdf integer -r 10 观测状态序列为0,1,2,...,9表示
 
                 -opdf gaussian_mixture -ng 3 观测状态序列的分布为3个高斯分布
 
                 -opdf  multi_gaussian -d 3 观测状态序列的元素为3*3矩阵
*/