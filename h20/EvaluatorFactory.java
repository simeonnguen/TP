package com.fearsfx.elsys.interclass2;

public class EvaluatorFactory implements IEvaluatorFactory{

	private Evaluator eval;
	
	@Override
	public IEvaluator createSumEvaluator() {
		eval = new SumEvaluator();
		
		return eval;
	}

	@Override
	public IEvaluator createPowerOnEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEvaluator createPowerOnEvaluator(double power) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEvaluator createFibonaciEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}

}
