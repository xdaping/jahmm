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
 
-opdf [integer|gaussian|gaussian_mixture|multi_gaussian]  ָ���۲����еķֲ�����
        Determines the observation distribution type associated with the
        states of the HMM.
-r <range> ����۲�����Ϊ������ָ����Χ        The 'range' option is mandatory when using        distributions dealing with integers; <range> is a number such        that the distribution is related to numbers in the range        0, 1, ..., range-1.
-ng <number> ����۲����еķֲ�Ϊ�����˹�ֲ���ָ����˹�ֲ��ĸ���
 
        This option is mandatory when using gaussian mixture
 
        distribution.  It  determines the number of gaussians.
 
-d <dimension> ����۲����еķֲ�Ϊ��ά�������ĸ�˹�ֲ���ָ������γ��
 
        This option is mandatory when using multi-variate gaussian
 
        distributions. It determines the dimension of the observation
 
        vectors.
-n <nb_states> ָ����״̬��
        The number of states of the HMM.
 
-i <input_file> ָ������
 
        An HMM input file.  Default is standard input.
 
-o <output_file> ָ�����
 
        An HMM output file.  Default is standard output.
 
-os <output_file>  ָ����������ļ� 
 
        A sequences output file.
 
  Default is standard output.
 
-is <input_file>  ָ�����������ļ�
 
        A sequences input file.
 
-ikl <input_file> ָ��ʹ�� Kullback-Leibler �㷨����HMM�������һ��HMMģ��
 
        An HMM input file with respect to which a Kullback-Leibler distance can        be computed.-ni <nb> ָ��BaumWelch�㷨��������        The number of iterations performed by the Baum-Welch algorithm.  Default is 10.All input (resp. output) file names can be replaced by '-' to mean usingstandard input (resp. output).
*/