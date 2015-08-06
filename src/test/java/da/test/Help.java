package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class Help {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cli.main("-help".split(" "));
	}

}

/*
java -cp jahmm-0.6.1.jar be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli -help
 
-opdf [integer|gaussian|gaussian_mixture|multi_gaussian]  指定观测序列的分布特征
        Determines the observation distribution type associated with the
        states of the HMM.
-r <range> 如果观测序列为整数，指定范围        The 'range' option is mandatory when using        distributions dealing with integers; <range> is a number such        that the distribution is related to numbers in the range        0, 1, ..., range-1.
-ng <number> 如果观测序列的分布为多个高斯分布，指定高斯分布的个数
 
        This option is mandatory when using gaussian mixture
 
        distribution.  It  determines the number of gaussians.
 
-d <dimension> 如果观测序列的分布为多维度向量的高斯分布，指定向量纬度
 
        This option is mandatory when using multi-variate gaussian
 
        distributions. It determines the dimension of the observation
 
        vectors.
-n <nb_states> 指定隐状态数
        The number of states of the HMM.
 
-i <input_file> 指定输入
 
        An HMM input file.  Default is standard input.
 
-o <output_file> 指定输出
 
        An HMM output file.  Default is standard output.
 
-os <output_file>  指定输出序列文件 
 
        A sequences output file.
 
  Default is standard output.
 
-is <input_file>  指定输入序列文件
 
        A sequences input file.
 
-ikl <input_file> 指定使用 Kullback-Leibler 算法计算HMM距离的另一个HMM模型
 
        An HMM input file with respect to which a Kullback-Leibler distance can        be computed.-ni <nb> 指定BaumWelch算法迭代次数        The number of iterations performed by the Baum-Welch algorithm.  Default is 10.All input (resp. output) file names can be replaced by '-' to mean usingstandard input (resp. output).
*/