package com.liferay.tongues.function.types;

public class JavaPureFunctions {

	public class MutableSideVariableClass {

		public int addThisAndDoMore(int x, int y) {
			// A variable that is not visible in the inputs and outputs of this
			// function is modified making this function impure
			_sideVariable = 3;
			return x + y;
		}

		public int getMainVariable() {
			return _mainVariable;
		}

		public int getSideVariable() {
			return _sideVariable;
		}

		private int _mainVariable = 1;
		private int _sideVariable = 2;

	}

	public class ImmutableSideVariableClass {

		public int addThisAndDoNothingElse(int x, int y) {
			// No other variables are modified in this function
			// The inputs and outputs are more or less predictable to the caller
			return x + y;
		}

		public int getSideVariable() {
			return _sideVariable;
		}

		private final int _sideVariable = 2;

	}

}
