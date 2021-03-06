/**
 * This file is part of lup1.
 *
 * lup1 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * lup1 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.				 
 * 
 * You should have received a copy of the GNU General Public License
 * along with lup1.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Edouard CATTEZ <edouard.cattez@sfr.fr> (La 7 Production)
 */
package fr.da2i.lup1.resource.formation;

import javax.ws.rs.Path;

import org.glassfish.jersey.server.model.Resource;

import fr.da2i.lup1.filter.PromotionAccess;
import fr.da2i.lup1.resource.note.NoteResource;
import fr.da2i.lup1.resource.student.StudentByFormationResource;
import fr.da2i.lup1.security.Authenticated;

@PromotionAccess
@Authenticated
public class PromotionResource extends AnnualResource {
	
	public PromotionResource() {}
	
	@Path("notes")
	public Resource getNoteResource() {
		return Resource.from(NoteResource.class);
	}
	
	@Path("semestres/{semestre: [0-9]+}")
	public Resource getSemestreResource() {
		return Resource.from(SemestreResource.class);
	}
	
	@Path("etudiants")
	public Resource getEtudiantResource() {
		return Resource.from(StudentByFormationResource.class);
	}
}
