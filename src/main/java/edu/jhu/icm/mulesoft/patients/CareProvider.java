package edu.jhu.icm.mulesoft.patients;

/*
Copyright 2017 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

/**
* @author Stephen Granite
* 
*/

import java.util.ArrayList;

import edu.jhu.icm.mulesoft.common.Identifier;

public class CareProvider {
	
	private ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
	private String name, type;

	public ArrayList<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(ArrayList<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
