package week7.adapter;

class OldEmpleeAdapter implements IModernWorker {
	private OldEmployee oldEmployee;

	@Override
	public void modernWork() {
		oldEmployee.oldWork();
	}

	public void setOldEmployee(OldEmployee oldEmployee) {
		this.oldEmployee = oldEmployee;
	}
	
}