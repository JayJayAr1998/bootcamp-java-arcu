package paracticaSemanl6;

import clase7.Articulo;

public class AccionBaja implements IAccion {
	
	@Override
	public void exec(Articulo ctx) {
		
		//dar de baja por id
		try {
			InMemoryDB.delete(ctx.getId());
		} catch (MemoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Se ha elminado el articulo de id:" + ctx.getId());
	}

}
