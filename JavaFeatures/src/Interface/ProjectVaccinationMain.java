package Interface;

public class ProjectVaccinationMain
{
public static void main(String[] args) {
	Vaccination v= new Vaccination();
	v.requirements();
	v.planning();
	v.designing();
	v.development();
	v.deployment();
	v.testing();
	v.maintaince();
	v.newChanges();
	//v.changeProjectName();
	Project.methodStatic();
	Vaccination.methodStatic();
}
}
