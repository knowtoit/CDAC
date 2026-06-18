class Addition{
	public static void main(String[] args){
		System.out.println("Enter 2 nos.");
		System.out.println("Length:" + args.length);
		int sum = 0;
		for(int i=0; i<args.length; i++){
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Addition: " + sum);
	}
}